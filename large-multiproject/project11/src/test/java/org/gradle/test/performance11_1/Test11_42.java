package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_42 {
    private final Production11_42 production = new Production11_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}