package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_286 {
    private final Production78_286 production = new Production78_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}