package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_61 {
    private final Production11_61 production = new Production11_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}