package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_304 {
    private final Production78_304 production = new Production78_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}