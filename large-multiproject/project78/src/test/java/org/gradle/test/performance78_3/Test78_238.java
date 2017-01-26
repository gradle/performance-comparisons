package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_238 {
    private final Production78_238 production = new Production78_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}