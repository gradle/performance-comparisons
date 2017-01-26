package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_172 {
    private final Production95_172 production = new Production95_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}