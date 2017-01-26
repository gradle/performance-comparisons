package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_234 {
    private final Production26_234 production = new Production26_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}