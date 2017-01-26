package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_338 {
    private final Production78_338 production = new Production78_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}