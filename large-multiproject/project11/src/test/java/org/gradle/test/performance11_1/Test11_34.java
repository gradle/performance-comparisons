package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_34 {
    private final Production11_34 production = new Production11_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}