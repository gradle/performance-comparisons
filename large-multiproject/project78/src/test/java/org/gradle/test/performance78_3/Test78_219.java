package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_219 {
    private final Production78_219 production = new Production78_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}