package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_253 {
    private final Production78_253 production = new Production78_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}