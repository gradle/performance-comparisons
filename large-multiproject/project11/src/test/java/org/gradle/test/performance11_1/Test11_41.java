package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_41 {
    private final Production11_41 production = new Production11_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}