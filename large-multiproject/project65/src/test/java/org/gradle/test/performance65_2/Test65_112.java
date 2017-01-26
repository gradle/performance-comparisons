package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_112 {
    private final Production65_112 production = new Production65_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}