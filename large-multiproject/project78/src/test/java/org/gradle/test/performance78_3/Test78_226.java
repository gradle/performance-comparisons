package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_226 {
    private final Production78_226 production = new Production78_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}