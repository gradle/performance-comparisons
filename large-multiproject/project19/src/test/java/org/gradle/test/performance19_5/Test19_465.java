package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_465 {
    private final Production19_465 production = new Production19_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}