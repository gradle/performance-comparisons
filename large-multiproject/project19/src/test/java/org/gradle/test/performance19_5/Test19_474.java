package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_474 {
    private final Production19_474 production = new Production19_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}