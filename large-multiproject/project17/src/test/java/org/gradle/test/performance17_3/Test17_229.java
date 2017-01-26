package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_229 {
    private final Production17_229 production = new Production17_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}