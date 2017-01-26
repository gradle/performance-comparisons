package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_99 {
    private final Production11_99 production = new Production11_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}