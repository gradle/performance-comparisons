package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_322 {
    private final Production78_322 production = new Production78_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}