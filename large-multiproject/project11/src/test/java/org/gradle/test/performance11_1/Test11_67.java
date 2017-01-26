package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_67 {
    private final Production11_67 production = new Production11_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}