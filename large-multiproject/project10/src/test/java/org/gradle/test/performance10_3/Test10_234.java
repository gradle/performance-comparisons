package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_234 {
    private final Production10_234 production = new Production10_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}