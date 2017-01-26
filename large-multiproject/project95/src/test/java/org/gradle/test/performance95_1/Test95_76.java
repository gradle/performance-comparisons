package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_76 {
    private final Production95_76 production = new Production95_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}