package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_282 {
    private final Production95_282 production = new Production95_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}