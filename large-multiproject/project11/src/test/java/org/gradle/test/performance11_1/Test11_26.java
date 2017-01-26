package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_26 {
    private final Production11_26 production = new Production11_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}