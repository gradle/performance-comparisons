package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_234 {
    private final Production95_234 production = new Production95_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}