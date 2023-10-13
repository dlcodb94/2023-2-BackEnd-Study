package GDSC.backend.BootDemo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/** DemoController.java **/

@RequiredArgsConstructor
@RestController
@RequestMapping("/demo")
    public class DemoController {
    private final DemoService demoService;
    @GetMapping("/demoEntities")
    public ResponseEntity<List<DemoDto>> getDemoEntities() {
            return ResponseEntity.ok().body(demoService.getDemoEntities());
    }


    @PostMapping("/demoEntities")
    public void getDemoEntities(@RequestBody DemoDto demoDto) {
        demoService.addDemoEntity(demoDto);
        }
    }