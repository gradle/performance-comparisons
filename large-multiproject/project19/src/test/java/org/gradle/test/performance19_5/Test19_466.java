package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_466 {
    private final Production19_466 production = new Production19_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}