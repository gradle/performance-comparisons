package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_202 {
    private final Production78_202 production = new Production78_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}