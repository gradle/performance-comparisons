package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_234 {
    private final Production2_234 production = new Production2_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}