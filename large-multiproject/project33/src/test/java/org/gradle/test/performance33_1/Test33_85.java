package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_85 {
    private final Production33_85 production = new Production33_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}