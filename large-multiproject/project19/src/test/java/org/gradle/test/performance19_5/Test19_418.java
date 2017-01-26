package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_418 {
    private final Production19_418 production = new Production19_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}