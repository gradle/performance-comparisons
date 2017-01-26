package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_325 {
    private final Production78_325 production = new Production78_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}