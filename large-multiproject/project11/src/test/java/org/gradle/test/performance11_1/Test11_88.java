package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_88 {
    private final Production11_88 production = new Production11_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}