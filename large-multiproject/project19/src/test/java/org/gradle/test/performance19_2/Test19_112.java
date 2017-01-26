package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_112 {
    private final Production19_112 production = new Production19_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}