package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_229 {
    private final Production11_229 production = new Production11_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}