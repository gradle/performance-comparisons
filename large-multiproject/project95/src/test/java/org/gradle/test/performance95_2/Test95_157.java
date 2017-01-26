package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_157 {
    private final Production95_157 production = new Production95_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}