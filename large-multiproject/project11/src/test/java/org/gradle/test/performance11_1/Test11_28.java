package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_28 {
    private final Production11_28 production = new Production11_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}