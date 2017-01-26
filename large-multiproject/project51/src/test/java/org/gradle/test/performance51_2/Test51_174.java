package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_174 {
    private final Production51_174 production = new Production51_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}