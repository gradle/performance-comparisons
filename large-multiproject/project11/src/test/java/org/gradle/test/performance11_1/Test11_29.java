package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_29 {
    private final Production11_29 production = new Production11_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}