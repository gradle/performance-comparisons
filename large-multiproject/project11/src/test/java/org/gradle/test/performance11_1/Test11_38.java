package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_38 {
    private final Production11_38 production = new Production11_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}