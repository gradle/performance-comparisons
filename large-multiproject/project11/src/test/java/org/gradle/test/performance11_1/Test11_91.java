package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_91 {
    private final Production11_91 production = new Production11_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}