package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_85 {
    private final Production85_85 production = new Production85_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}