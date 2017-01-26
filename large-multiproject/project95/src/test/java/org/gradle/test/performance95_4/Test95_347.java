package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_347 {
    private final Production95_347 production = new Production95_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}