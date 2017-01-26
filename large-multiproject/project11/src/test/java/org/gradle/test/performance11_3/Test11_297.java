package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_297 {
    private final Production11_297 production = new Production11_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}