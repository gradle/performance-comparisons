package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_97 {
    private final Production11_97 production = new Production11_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}