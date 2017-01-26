package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_40 {
    private final Production95_40 production = new Production95_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}