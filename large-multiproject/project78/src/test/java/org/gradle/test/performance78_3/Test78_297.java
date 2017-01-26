package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_297 {
    private final Production78_297 production = new Production78_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}