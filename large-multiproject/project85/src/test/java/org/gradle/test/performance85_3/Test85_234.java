package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_234 {
    private final Production85_234 production = new Production85_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}