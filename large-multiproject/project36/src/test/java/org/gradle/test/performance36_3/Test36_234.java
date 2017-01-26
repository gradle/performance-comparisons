package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_234 {
    private final Production36_234 production = new Production36_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}