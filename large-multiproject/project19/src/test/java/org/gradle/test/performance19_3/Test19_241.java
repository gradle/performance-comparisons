package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_241 {
    private final Production19_241 production = new Production19_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}