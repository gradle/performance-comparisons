package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_320 {
    private final Production78_320 production = new Production78_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}