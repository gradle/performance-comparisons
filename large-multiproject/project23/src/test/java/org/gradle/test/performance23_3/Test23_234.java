package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_234 {
    private final Production23_234 production = new Production23_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}