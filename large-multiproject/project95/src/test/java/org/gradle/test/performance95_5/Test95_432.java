package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_432 {
    private final Production95_432 production = new Production95_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}