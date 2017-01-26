package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_162 {
    private final Production78_162 production = new Production78_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}