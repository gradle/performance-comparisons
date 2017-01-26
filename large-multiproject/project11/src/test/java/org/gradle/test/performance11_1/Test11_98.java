package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_98 {
    private final Production11_98 production = new Production11_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}