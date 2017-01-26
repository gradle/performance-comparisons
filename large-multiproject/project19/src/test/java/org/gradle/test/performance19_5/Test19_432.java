package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_432 {
    private final Production19_432 production = new Production19_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}